package com.homework.wk05.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class JdbcDemo {

    public Map<String, String> query() throws SQLException, ClassNotFoundException {
        Connection conn = JdbcUtil.getConnection();
        PreparedStatement ps = conn.prepareStatement("select id, name from student limit 1");
        ResultSet rs = ps.executeQuery();
        rs.next();
        Map<String, String> result = new HashMap<>();
        result.put("id", String.valueOf(rs.getLong("id")));
        result.put("name", rs.getString("name"));
        return result;
    }

    public int delete() throws SQLException, ClassNotFoundException {
        Connection conn = JdbcUtil.getConnection();
        PreparedStatement ps = conn.prepareStatement("delete from student where id = 1");
        return ps.executeUpdate();
    }

    public int update() throws SQLException, ClassNotFoundException {
        Connection conn = JdbcUtil.getConnection();
        PreparedStatement ps = conn.prepareStatement("update student set name = ? where id = 1");
        ps.setString(1, "张三");
        return ps.executeUpdate();
    }

    public int add() throws SQLException, ClassNotFoundException {
        Connection conn = JdbcUtil.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into student(id, name)values(?, ?)");
        ps.setLong(1, 2);
        ps.setString(2, "李四");
        return ps.executeUpdate();
    }

    public void transaction() throws SQLException, ClassNotFoundException {
        Connection conn = JdbcUtil.getConnection();
        conn.setAutoCommit(false);

        try {
            PreparedStatement ps = conn.prepareStatement("update student set name = ? where id = 1");
            ps.setString(1, "张三");
            ps.executeUpdate();

            ps = conn.prepareStatement("insert into student(id, name)values(?, ?)");
            ps.setLong(1, 2);
            ps.setString(2, "李四");
            ps.executeUpdate();

            conn.commit();
        } catch (Exception e) {
            conn.rollback();
        }
    }

    public void batch() throws SQLException, ClassNotFoundException {
        Connection conn = JdbcUtil.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into student(id, name)values(?, ?)");
        ps.setLong(1, 2);
        ps.setString(2, "李四");
        ps.addBatch();

        ps.setLong(1, 3);
        ps.setString(2, "王五");
        ps.addBatch();
        ps.executeBatch();
    }
}

package CL7.dataSource_jdbcTemplate.jdbctemplate;

import CL7.dataSource_jdbcTemplate.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author promise
 * @date 2019/12/9 - 13:58
 * JdbcTemplate入门
 */

public class JdbcTemplateDemo1 {
    public static void main(String[] args) {
        //1.导入jar包
        //2.创建JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        //3.调用方法
        String sql = "update account set balance = 5000 where id = ?";
        int count = template.update(sql, 4);
        System.out.println(count);
    }
}

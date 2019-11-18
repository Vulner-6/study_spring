import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 程序的耦合
 *     耦合：粗略的理解就是程序间的依赖关系
 *          类与类的依赖
 *          方法与方法的依赖
 *     解耦：降低程序间的依赖关系
 * 实际开发，应该做到——“编译期不依赖，运行时才依赖”
 * 解耦的思路：
 *     第一步：使用反射，少用new
 *     第二步：读取配置文件，解决 "com.mysql.jdbc.cj.Driver" 这种一旦换数据库就要修改代码的问题
 */
public class JdbcDemo1
{
    public static void main(String[] args) throws Exception
    {
        //1.注册驱动，不建议new一个
        //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Class.forName("com.mysql.cj.jdbc.Driver");  //建议使用反射
        //2.获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/study_jdbc?useUnicode=true" +
                "&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT","root","root");
        //预编译执行语句
        PreparedStatement pstmt=conn.prepareStatement("SELECT * FROM users");
        ResultSet resultSet=pstmt.executeQuery();
        while (resultSet.next())
        {
            System.out.println(resultSet.getString("name"));
        }
        //释放资源
        resultSet.close();
        pstmt.close();
        conn.close();
    }
}

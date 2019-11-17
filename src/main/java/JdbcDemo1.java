import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 程序的耦合
 */
public class JdbcDemo1
{
    public static void main(String[] args) throws Exception
    {
        //1.注册驱动
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
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

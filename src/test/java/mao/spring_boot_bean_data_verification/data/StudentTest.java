package mao.spring_boot_bean_data_verification.data;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：spring_boot_Bean_data_verification
 * Package(包名): mao.spring_boot_bean_data_verification.data
 * Class(测试类名): StudentTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/16
 * Time(创建时间)： 12:46
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */

@SpringBootTest
class StudentTest
{

    @Autowired
    Student student;

    @Test
    public void testStudent()
    {
        System.out.println(student);
    }
}
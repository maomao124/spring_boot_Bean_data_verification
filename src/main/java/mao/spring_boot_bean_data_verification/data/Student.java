package mao.spring_boot_bean_data_verification.data;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Project name(项目名称)：spring_boot_Bean_data_verification
 * Package(包名): mao.spring_boot_bean_data_verification.data
 * Class(类名): Student
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/16
 * Time(创建时间)： 12:40
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Component
@Validated
@ConfigurationProperties(prefix = "student")
public class Student
{
    @Max(value = 1000, message = "最大值不能超过1000")
    private long studentNo;
    @NotNull(message = "不能为null")
    @NotEmpty(message = "不能为空")
    private String name;
    private String sex;
    @Max(value = 100, message = "最大值不能超过100")
    @Min(value = 18, message = "最小值不能小于18")
    private int age;

    public long getStudentNo()
    {
        return studentNo;
    }

    public void setStudentNo(long studentNo)
    {
        this.studentNo = studentNo;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("studentNo：").append(studentNo).append('\n');
        stringbuilder.append("name：").append(name).append('\n');
        stringbuilder.append("sex：").append(sex).append('\n');
        stringbuilder.append("age：").append(age).append('\n');
        return stringbuilder.toString();
    }
}

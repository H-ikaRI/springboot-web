package com.itheima;

import com.itheima.mapper.EmpMapper;
import com.itheima.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class SpringbootMybatisCrudApplicationTests {

    @Autowired
    private EmpMapper empMapper;

    @Test
    public void testDelete(){
        empMapper.delete(14);
    }
    @Test
    public void testList(){
        List<Emp>  emplist = empMapper.list(null,null,null,null);
        System.out.println(emplist);
    }
    @Test
    public void testUpdate2(){
        //构造员工对象
        Emp emp = new Emp();
        emp.setId(19);
        emp.setUsername("sdq");
        emp.setName("卧槽");
        emp.setGender((short)2);
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.update2(emp);
    }

    //批量删除员工
    @Test
    public void testDeleteById(){
        List<Integer> ids = Arrays.asList(6,7,2);
        empMapper.deleteByIds(ids);
    }
    
}

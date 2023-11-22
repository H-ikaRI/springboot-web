package com.itheima.mapper;

import com.itheima.pojo.Emp;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.List;


@Mapper
public interface EmpMapper {
    /*根据id删除数*/
    @Delete("delete from mybatis.emp where id = #{id}")
    public void delete(Integer id);

    //新增员工
    @Insert("insert into emp(username,name,gender,image,job,entrydate,dept_id,create_time,update_time)\n"+
            "values (#{username},#{name},#{gender},#{image}，#{job}，#{entrydate},#{deptId},#{createTime},#{updataTime})")
    public void insert(Emp emp);
/*

//条件查询员工
    @Select("select * from emp where name like concat('%','#{name}','%') and gender = #{gender} and " + "entrydate between #{begin} and #{end} order by update_time desc ")
    public List<Emp> list(String name, short gender , LocalDate begin , LocalDate end);
*/
    public List<Emp> list(String name, Short gender , LocalDate begin , LocalDate end);
    //动态更新员工
    public void update2(Emp emp);
    //批量删除员工
    public void deleteByIds(List<Integer> ids);




}

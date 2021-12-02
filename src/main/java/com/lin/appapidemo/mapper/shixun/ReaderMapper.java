package com.lin.appapidemo.mapper.shixun;

import com.lin.appapidemo.model.shixun.Reader;
import com.lin.appapidemo.util.MyMapper;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ReaderMapper extends MyMapper<Reader> {
    @Select("select * from t_reader where rid=#{rid}")
    Reader selectById(@Param("rid") int rid);

    @Select("select * from t_reader where account=#{account}")
    Reader selectWholeByAccount(@Param("account") String account);

    @Select("select * from t_reader where account like concat('%',concat(#{account},'%'))")
    List<Reader> selectByAccount(@Param("account") String account);

    @Delete("delete from t_reader where account=#{account}")
    int deleteByAccount(@Param("account") String account);

    /*@Insert("insert into t_reader (account,password,name,sex,time,condi) values(#{account},#{account},#{name},#{sex},#{time},#{condi})")
    @Override
    int insert(Reader reader);*/
}

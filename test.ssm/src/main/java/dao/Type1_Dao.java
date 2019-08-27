package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.Type;
@Repository
public interface Type1_Dao {
	@Select("select * from Type ")
	public List<Type> select();
	
	@Select("select * from Type where id=#{id}")
	public Type selectById(int id);
	
	@Insert("insert into type(name) value(#{name})")
	public void insert(Type t);
	
	@Update("update type set name=#{name} where id=#{id}")
	public void update(Type t);
	
	@Delete("delete from type where id=#{id}")
	public void delete(int id);
}
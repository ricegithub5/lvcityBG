package com.neuedu.lvcity.dao;

import java.util.List;
import java.util.Map;

import com.neuedu.lvcity.model.Banar;

public interface BanarDao {
	
	public int banarCount();//总记录数
	public List<Banar> findAllBanar(Map<String, Object> map);//查询数据
	public int addBanar(String imagePath);//添加数据
	public int updateBanar(Banar banar);//修改数据
	public int deleteBanar(Banar banar);//删除数据
	public Banar findOneBanar(Banar banar);
}

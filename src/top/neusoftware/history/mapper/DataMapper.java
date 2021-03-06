package top.neusoftware.history.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.neusoftware.history.model.AddRecord;
import top.neusoftware.history.model.Data;
import top.neusoftware.history.model.DeleteRecord;

public interface DataMapper {
	public List<Data> getDatas(@Param("table") String table);
	public Data getData(@Param("table") String table, @Param("data_id") int id);
	public int getLastId();
	public void addData(@Param("table") String table, @Param("data") Data data);
	public void deleteData(@Param("table") String table, @Param("id") int id); 
	public void deleteRecord(DeleteRecord dr);
	public void addRecord(AddRecord ar);
}

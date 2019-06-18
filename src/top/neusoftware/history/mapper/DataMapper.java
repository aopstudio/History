package top.neusoftware.history.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.neusoftware.history.model.Data;
import top.neusoftware.history.model.DeleteRecord;

public interface DataMapper {
	public List<Data> getDatas();
	public Data getData(@Param("data_id") int id);
	public void addData(Data data);
	public void deleteData(@Param("id") int id); 
	public void deleteRecord(DeleteRecord dr);
}

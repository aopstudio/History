package top.neusoftware.history.mapper;

import java.util.List;

import top.neusoftware.history.model.Data;

public interface DataMapper {
	public List<Data> getDatas();
	public void addData(Data data);
}

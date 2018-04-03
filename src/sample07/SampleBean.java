package sample07;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class SampleBean {
	private DriverManagerDataSource datasource;

	public DriverManagerDataSource getDatasource(){
		return this.datasource;
	}

	public void setDatasource(DriverManagerDataSource datasource){
		this.datasource = datasource;
	}

	public List<?> getAll(){
		JdbcTemplate jt = new JdbcTemplate(this.datasource);

		final String sql = "select * from tbl_sample";

		return jt.queryForList(sql);
	}

}

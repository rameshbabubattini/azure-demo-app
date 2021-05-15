package info.code2learn.azuredemoapp.entity;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;

@Table("user")
@Data
public class User {
	
	@PrimaryKey("userid")
	private Integer userid;
	
	@Column("name")
	private String name; 

	@Column("email")
	private String email;
}

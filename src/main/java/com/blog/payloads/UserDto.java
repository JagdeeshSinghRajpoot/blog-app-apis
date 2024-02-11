package com.blog.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	private int id;
	
	
	@NotEmpty //null value + blank
	@Size(min = 4, message="Username must be min of 4 charactors !!")
	private String name;
	
	@Email(message= "Emaill address is not valid !!")
	private String email;
	
//	@Parent
	@NotEmpty
	@Size(min=3,max=10,message = "Password must be min of 3 chars and max of 10 chars !!")
	private String password;
	
	@NotEmpty
	private String about;
	
}

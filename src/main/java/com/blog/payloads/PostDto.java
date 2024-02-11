package com.blog.payloads;

import com.blog.entitys.Category;
import com.blog.entitys.Comment;
import com.blog.entitys.User;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {

	private Integer id;
	@NotBlank
	@Size(min = 8, message = "minimum 8 character enter here")
	private String title;
	private String content;
	private  String imageName;
	private Date addedDate;
	private CategoryDto category;
	private UserDto user;
	private Set<CommentDto> comments = new HashSet<>();

}

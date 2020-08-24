package com.razz.model;

import lombok.Data;

@Data
public class User {

	private Long UserId;

	private String firstName;

	private String lastName;

	private String userEmail;

	private String userPazzword;

	private String gender;

	private String Role;

	private boolean deleteStatus;

	private String unloackStatus;
}

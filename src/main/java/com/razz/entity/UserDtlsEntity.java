package com.razz.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "USER_DETAILS", uniqueConstraints = @UniqueConstraint(columnNames = "user_Email"))
public class UserDtlsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long UserId;

	@Column(name = "FIRST_NAME", nullable = false)
	private String firstName;

	@Column(name = "LAST_NAME", nullable = false)
	private String lastName;

	@Column(name = "USER_EMAIL", nullable = false)
	private String userEmail;

	@Column(name = "USER_PWD", nullable = false)
	private String userPazzword;

	@Column(name = "GENDER", nullable = false)
	private String gender;

	@Column(name = "ROLE", nullable = false)
	private String Role;

	@Column(name = "CREATED_DATE", updatable = false)
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date createdDate;

	@Column(name = "UPDATED_DATE", insertable = false)
	@UpdateTimestamp
	@Temporal(TemporalType.DATE)
    private Date updatedDate;

	@Column(name = "DEL_STATUS", nullable = false)
	private boolean deleteStatus;

	@Column(name = "UNLOCK_STATUS", nullable = false)
	private String unloackStatus;

}

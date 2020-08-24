package com.razz.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.razz.entity.UserDtlsEntity;
import com.razz.model.User;
import com.razz.repository.UserDtlsRepository;
import com.razz.utils.TempPasswordUtils;

@Service
public class UserDtlsServiceImpl implements UserDtlsService {

	@Autowired
	UserDtlsRepository userdtlsrepo;

	@Override
	public User save(User user) {
		UserDtlsEntity entity = new UserDtlsEntity();
		user.setDeleteStatus(false);
		user.setUnloackStatus("LOCKED");
		user.setUserPazzword(TempPasswordUtils.generateTempPassword(6));
		BeanUtils.copyProperties(user, entity);
		System.out.println(entity);
		UserDtlsEntity savedentity = userdtlsrepo.save(entity);
		User returneduser = new User();
		BeanUtils.copyProperties(savedentity, returneduser);
		return returneduser;
	}

}

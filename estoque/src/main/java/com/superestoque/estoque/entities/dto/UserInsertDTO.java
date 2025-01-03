package com.superestoque.estoque.entities.dto;

import com.superestoque.estoque.services.validation.UserInsertValid;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@UserInsertValid
public class UserInsertDTO extends UserDTO {

	private static final long serialVersionUID = 1L;

	@Size(min = 8, message = "A senha deve conter no mínimo oito caracteres")
	@NotBlank(message = "O campo senha é obrigatório")
	private String password;

	public UserInsertDTO(Long id, String name, String email, byte[] photo, boolean status, boolean first_acess,
			String password) {
		super(id, name, email, photo, status, first_acess);
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
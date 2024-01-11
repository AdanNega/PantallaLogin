package Controller;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class UserBean {

	private String usuario;
	private String pass;
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public void displayMessage() {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage("Usuario Confirmado", "Bienvenido " + usuario));
	}
	
}

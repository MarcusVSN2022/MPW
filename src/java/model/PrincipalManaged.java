/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author labinf
 */
@ManagedBean
public class PrincipalManaged {

    public String doEfetuarMontagem() {

        return "login";

    }

    public PrincipalManaged() {
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import DataAccess.PersonDAO;

/**
 *
 * @author hieu
 */
public class PersonRepository implements IPersonRepository{
    @Override
    public void findPersonInfo() {
        PersonDAO.Instance().findPersonInfo();
    }

    @Override
    public void copyNewFile() {
        PersonDAO.Instance().copyNewFile();
    }
}
package org.ua.ilm.Main;

import org.ua.ilm.DAO.CrudDbSQL;
import org.ua.ilm.DAO.Dao;
import org.ua.ilm.DAO.FileDB;
import org.ua.ilm.Model.FileEntity;
import org.ua.ilm.View.FileViewImpl;

public class Main {
    public static void main(String[] args) {
        Dao dao = new Dao(new CrudDbSQL(),new FileDB());
        FileEntity fileEntity = dao.getFileDao().findByNameFile("что-то");
        FileViewImpl view = new FileViewImpl();
        view.print(fileEntity);
    }
}

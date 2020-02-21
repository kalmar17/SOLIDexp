package org.ua.ilm.DAO;

public class Dao { //Принцип инверсии зависимостей (DIP)
    CrudDao crudDao;
    FileDao fileDao;

    public CrudDao getCrudDao() {
        return crudDao;
    }

    public void setCrudDao(CrudDao crudDao) {
        this.crudDao = crudDao;
    }

    public FileDao getFileDao() {
        return fileDao;
    }

    public void setFileDao(FileDao fileDao) {
        this.fileDao = fileDao;
    }

    public Dao(CrudDao crudDao, FileDao fileDao) {
        this.crudDao = crudDao;
        this.fileDao = fileDao;
    }

}

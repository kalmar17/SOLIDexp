package org.ua.ilm.DAO;

import org.ua.ilm.Model.FileEntity;

public interface CrudDao {//Принцип единственной ответственности (SRP)
    void create(FileEntity fileEntity);
    void update(FileEntity fileEntity);
    void delete(FileEntity fileEntity);
}

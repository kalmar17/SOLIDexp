package org.ua.ilm.DAO;

import org.ua.ilm.Model.FileEntity;

import java.util.List;

public interface FileDao {//Принцип единственной ответственности (SRP)
    FileEntity findByNameFile(String name);
    List<FileEntity> findAllByFormatFile(String format);
}

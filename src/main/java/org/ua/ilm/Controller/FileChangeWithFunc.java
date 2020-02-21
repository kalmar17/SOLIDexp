package org.ua.ilm.Controller;

import org.ua.ilm.Model.FileEntity;

public class FileChangeWithFunc extends FileChange {   //Принцип открытости/закрытости (OCP) + Принцип подстановки Барбары Лисков (LSP)

    @Override
    FileEntity changeTextFile(FileEntity fileEntity, String newText) {
        safeOldVersionFile(fileEntity);
        return super.changeTextFile(fileEntity, newText);

    }

    @Override
    FileEntity changeFormatFile(FileEntity fileEntity, String newFormat) {
        return super.changeFormatFile(fileEntity, newFormat);
    }

    void safeOldVersionFile(FileEntity fileEntity){
        System.out.println("Создает временное хранилище для файла");
    }
}

package org.ua.ilm.Controller;

import org.ua.ilm.Model.FileEntity;

public class FuncChangeFile {
    public FileEntity changeText(FileChange fileChange, FileEntity fileEntity,String string){//Принцип подстановки Барбары Лисков (LSP)
        return fileChange.changeTextFile(fileEntity,string);
    }
    public FileEntity changeFormat(FileChange fileChange,FileEntity fileEntity,String string){//Принцип подстановки Барбары Лисков (LSP)
        return fileChange.changeFormatFile(fileEntity,string);
    }
}

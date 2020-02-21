package org.ua.ilm.View;

import org.ua.ilm.Model.FileEntity;

public interface FileViewTxt {//Принцип разделения интерфейса (ISP)
    void printTxt(FileEntity file);
}

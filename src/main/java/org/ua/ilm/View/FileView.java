package org.ua.ilm.View;

import org.ua.ilm.Model.FileEntity;

public interface FileView {//Принцип разделения интерфейса (ISP)
    void print(FileEntity file);
}

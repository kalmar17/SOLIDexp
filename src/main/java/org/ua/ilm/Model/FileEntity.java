package org.ua.ilm.Model;

public class FileEntity {//Принцип единственной ответственности (SRP)
    String name;
    String format;
    long size;

    public FileEntity(String name, String format, long size) {
        this.name = name;
        this.format = format;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

}

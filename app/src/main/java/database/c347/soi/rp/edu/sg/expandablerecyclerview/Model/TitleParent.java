package database.c347.soi.rp.edu.sg.expandablerecyclerview.Model;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.List;
import java.util.UUID;

public class TitleParent implements ParentObject {

    private List<Object> mChildrenList;
    private UUID uuid;
    private String bangName;
    private String imgURL;
    private String bgColor;

    public TitleParent(String imgURL, String bangName, String bgColor) {
        this.imgURL = imgURL;
        this.bgColor = bgColor;
        this.bangName = bangName;
        uuid = UUID.randomUUID();
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getBangName() {
        return bangName;
    }

    public void setBangName(String bangName) {
        this.bangName = bangName;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    @Override
    public List<Object> getChildObjectList() {
        return mChildrenList;
    }

    @Override
    public void setChildObjectList(List<Object> list) {
        mChildrenList = list;
    }
}

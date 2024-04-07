package com.example.thithu.Model;

public class XeMay {
    private String _id, ten_xe_ph44272, mau_sac_ph44272, gia_ban_ph44272, mo_ta_ph44272, hinh_anh_ph44272;
    public XeMay() {
    }

    public XeMay(String _id, String ten_xe_ph44272, String mau_sac_ph44272, String gia_ban_ph44272, String mo_ta_ph44272, String hinh_anh_ph44272) {
        this._id = _id;
        this.ten_xe_ph44272 = ten_xe_ph44272;
        this.mau_sac_ph44272 = mau_sac_ph44272;
        this.gia_ban_ph44272 = gia_ban_ph44272;
        this.mo_ta_ph44272 = mo_ta_ph44272;
        this.hinh_anh_ph44272 = hinh_anh_ph44272;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTen_xe_ph44272() {
        return ten_xe_ph44272;
    }

    public void setTen_xe_ph44272(String ten_xe_ph44272) {
        this.ten_xe_ph44272 = ten_xe_ph44272;
    }

    public String getMau_sac_ph44272() {
        return mau_sac_ph44272;
    }

    public void setMau_sac_ph44272(String mau_sac_ph44272) {
        this.mau_sac_ph44272 = mau_sac_ph44272;
    }

    public String getGia_ban_ph44272() {
        return gia_ban_ph44272;
    }

    public void setGia_ban_ph44272(String gia_ban_ph44272) {
        this.gia_ban_ph44272 = gia_ban_ph44272;
    }

    public String getMo_ta_ph44272() {
        return mo_ta_ph44272;
    }

    public void setMo_ta_ph44272(String mo_ta_ph44272) {
        this.mo_ta_ph44272 = mo_ta_ph44272;
    }

    public String getHinh_anh_ph44272() {
        return hinh_anh_ph44272;
    }

    public void setHinh_anh_ph44272(String hinh_anh_ph44272) {
        this.hinh_anh_ph44272 = hinh_anh_ph44272;
    }
}

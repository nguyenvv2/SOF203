/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sof203.luyentapjava2.service.impl;

import java.util.ArrayList;
import sof203.luyentapjava2.model.PhieuMuon;
import sof203.luyentapjava2.service.IPhieuMuonService;

/**
 *
 * @author nguyenvv
 */
public class PhieuMuonServiceImpl implements IPhieuMuonService {

    ArrayList<PhieuMuon> listPhieuMuon = new ArrayList<>();

    @Override
    public Boolean addPhieuMuon(PhieuMuon phieuMuon) {
        if (phieuMuon == null) {
            return false;
        } else {
            listPhieuMuon.add(phieuMuon);
            return true;
        }
    }

    @Override
    public ArrayList<PhieuMuon> getList() {
        return listPhieuMuon;
    }

    @Override
    public Boolean xoa(PhieuMuon phieuMuon) {
        if (phieuMuon == null) {
            return false;
        }
        listPhieuMuon.remove(phieuMuon);
        return true;
    }

    @Override
    public ArrayList<PhieuMuon> timKiem(String ten) {
        ArrayList<PhieuMuon> listOutPut = new ArrayList<>();
        for (PhieuMuon phieuMuon : listPhieuMuon) {
            if (phieuMuon.getTenSv().contains(ten)) {
                listOutPut.add(phieuMuon);
            }
        }
        return listOutPut;
    }

}

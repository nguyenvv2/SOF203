/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sof203.luyentapjava2.service;

import java.util.ArrayList;
import sof203.luyentapjava2.model.PhieuMuon;

/**
 *
 * @author nguyenvv
 */
public interface IPhieuMuonService {

    public Boolean addPhieuMuon(PhieuMuon phieuMuon);

    public ArrayList<PhieuMuon> getList();

    public Boolean xoa(PhieuMuon phieuMuon);

    public ArrayList<PhieuMuon> timKiem(String ten);
}

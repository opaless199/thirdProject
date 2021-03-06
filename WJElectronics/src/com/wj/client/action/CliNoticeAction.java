package com.wj.client.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wj.client.model.DAO.ClientNoticeDAO;
import com.wj.client.model.VO.ClientNoticeVO;
import com.wj.utils.CommandAction;

public class CliNoticeAction implements CommandAction {
	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		
		ClientNoticeDAO clientNoticeDao = ClientNoticeDAO.getInstance();
		
		
		ArrayList<ClientNoticeVO> result  = clientNoticeDao.getNoticeList();
		request.setAttribute("vo", result);
		
		System.out.println(result);
		return "/client/noticeForm.jsp";
	}
}

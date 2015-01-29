package demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;
 

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@RequestMapping(value = "/dataKaryawan", method = RequestMethod.GET)
    public ModelAndView downloadExcel() {

		List<Karyawan> karyawans = new ArrayList<Karyawan>();
		karyawans.add(new Karyawan("01", "Saifi Ahmada", "Banjarmain", "AiTi"));
		karyawans.add(new Karyawan("02", "Iyar Sudibyo", "Banjarmain", "AiTi"));
		karyawans.add(new Karyawan("03", "Utar Sudibyo", "Banjarmain", "AiTi"));
		karyawans.add(new Karyawan("04", "Wandi Sudibyo", "Banjarmain", "AiTi"));
		karyawans.add(new Karyawan("05", "Yadi Sudibyo", "Banjarmain", "AiTi"));
		karyawans.add(new Karyawan("06", "Dimas Sudibyo", "Banjarmain", "AiTi"));
		karyawans.add(new Karyawan("07", "Firman Sudibyo", "Banjarmain", "AiTi"));
		karyawans.add(new Karyawan("08", "Rizka Sudibyo", "Banjarmain", "AiTi"));
		karyawans.add(new Karyawan("09", "Arya Sudibyo", "Banjarmain", "AiTi"));
		karyawans.add(new Karyawan("10", "Dion Sudibyo", "Banjarmain", "AiTi"));
		karyawans.add(new Karyawan("11", "Philip Sudibyo", "Banjarmain", "AiTi"));
		karyawans.add(new Karyawan("12", "Ema Sudibyo", "Banjarmain", "AiTi"));
 
		// excelView dengan data list karyawans akan diterima oleh resolver exvelView
        return new ModelAndView("excelView", "karyawans", karyawans);
    }

}

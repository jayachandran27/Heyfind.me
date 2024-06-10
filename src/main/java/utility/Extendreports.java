package utility;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extendreports {
	public static ExtentReports extendreport() {

		
		File reportpath = new File("C:\\eclipse workspace1\\hey_findme\\Reports\\extendreports.html");
		ExtentSparkReporter extend = new ExtentSparkReporter(reportpath);
		extend.config().setReportName("heyfind.me automation report");
		extend.config().setDocumentTitle("heyfind.me AUTOMATION TESTING");
		ExtentReports report = new ExtentReports();
		report.attachReporter(extend);
		return report;

	}

}

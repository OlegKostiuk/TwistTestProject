import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumDriverFactory {

	private WebDriver browser;

	private String remoteServerUrl;
	private String platform;
	private String browserName;
	private String browserVersion;

	public void start() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		System.out.println(capabilities.getBrowserName());
		capabilities.setCapability(CapabilityType.BROWSER_NAME, browserName);
		capabilities.setCapability(CapabilityType.VERSION, browserVersion);
		capabilities.setCapability(CapabilityType.PLATFORM, platform);

		this.browser = new RemoteWebDriver(new URL(remoteServerUrl),
				capabilities);

	}

	public void stop() {
		browser.close();
		browser.quit();
	}

	public WebDriver getBrowser() {
		return browser;
	}

	public void setRemoteServerUrl(String remoteServerUrl) {
		this.remoteServerUrl = remoteServerUrl;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public void setBrowserName(String browserName) {
		this.browserName = browserName;
	}

	public void setBrowserVersion(String browserVersion) {
		this.browserVersion = browserVersion;
	}
}
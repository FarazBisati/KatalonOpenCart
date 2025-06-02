 package customKeywords

import com.kms.katalon.core.annotation.Keyword
import org.apache.commons.lang3.RandomStringUtils

class RandomDataUtils{

	@Keyword
	static def generateRandomName() {
		return RandomStringUtils.randomAlphabetic(8)
	}

	@Keyword
	static def generateRandomEmail() {
		return generateRandomName()+"@test.com"
	}

	@Keyword
	static def generateRandomTelephone() {
		return RandomStringUtils.randomNumeric(10)
	}

	@Keyword
	static def generaterandomPassword() {
		return RandomStringUtils.randomAlphanumeric(9)+"#!"
	}

	@Keyword
	static def generateRandomTelephone() {
		return RandomStringUtils.randomNumeric(10)
	}

	@Keyword
	static def generateRandomMobileNumber() {
		// US Format (123) 456-7890 //areacode+centralOfficeCode+stationNumber
		String areaCode = RandomStringUtils.randomNumeric(3)
		String centralOfficeCode = RandomStringUtils.randomNumeric(3)
		String stationNumber = RandomStringUtils.randomNumeric(4)

		return "("+areaCode+") " + centralOfficeCode + "-" + stationNumber
	}
}
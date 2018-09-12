package cn.taxcms.shui5

import xyz.itbang.gspider.Page
import xyz.itbang.gspider.Spider
import xyz.itbang.gspider.handler.AbstractHandler
import xyz.itbang.gspider.util.Tools

/**
 * Crawl the shui5 website.
 * @author Peter
 *
 */
class Main {
	static void main(String[] args) {
		
		String luofans = "http://www.shui5.cn/article/FaGuiJieDu/"
		def list = [luofans]
		
		Spider.crawl {
			seeds list
			thread 3
			rounds 3
			maxFetch 10000
			exclude '.*https:.*'
		
			handle { Page page ->
				println("Handle -> " + page.url)
				//println("Title -> " + page.document.title())
			}
		}
	}
}
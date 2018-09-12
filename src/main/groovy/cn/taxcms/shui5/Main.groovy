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
		
		String luofans = "http://www.shui5.cn/article/73/123569.html"
		def list = [luofans]
		
		Spider.crawl {
			seeds list
			thread 3
			rounds 3
			maxFetch 1
			exclude '.*https:.*'
		
			handle { Page page ->
				
				println("Handle -> " + page.url)
				println(page.getDocument().getElementsByClass("arcContent"))
				
				//println("Title -> " + page.document.title())
			}
		}
	}
}
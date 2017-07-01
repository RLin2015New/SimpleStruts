/**
 * 
 */
// console.info("index");
// alert("1");
function downloadFile(url) {
	try {
		var elemIF = document.createElement("iframe");
		elemIF.src = url;
		elemIF.style.display = "none";
		document.body.appendChild(elemIF);
	} catch (e) {

	}
};

// function saveImageAs(imgOrURL) {
// if (typeof imgOrURL == 'object')
// imgOrURL = imgOrURL.src;
// window.win = open(imgOrURL);
// setTimeout('win.document.execCommand("SaveAs")', 500);
// };

for (var i = 0; i < 10; i++) {
	for (var j = 0; j < 10; j++) {
		for (var z = 0; z < 10; z++) {
			var str;
			if (i + j + z == 0) {
				str = "https://chatstorysrc.guangzhuiyuan.com/storytalk/chatstoryweb/web_book2_c0.js";
			} else {
				str = "https://chatstorysrc.guangzhuiyuan.com/storytalk/chatstoryweb/web_book2_c"
						+ (i == 0 ? "" : i)
						+ ""
						+ (j == 0 ? "" : j)
						+ ""
						+ (z == 0 ? "" : z) + ".js";
			}
			console.info(str);
			downloadFile(str);
			// saveImageAs(str);s
		}
	}
}

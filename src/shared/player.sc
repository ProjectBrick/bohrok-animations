.flash
	filename="player.swf"
	version=5
	fps=18
	bbox=770x425
	background=#000000

	.box bgcolor_white_shape width=770 height=425 line=0 fill=#FFFFFF
	.box bgcolor_black_shape width=770 height=425 line=0 fill=#000000

	.font GillSans "fonts/gillsans.ttf"
	.font TradeMarkerLight "fonts/trademarker_light.ttf"

	.swf icon_Episode_01 "icons/Episode_01.swf"
	.swf icon_Episode_02 "icons/Episode_02.swf"
	.swf icon_Episode_03 "icons/Episode_03.swf"
	.swf icon_Episode_04 "icons/Episode_04.swf"
	.swf icon_Episode_05 "icons/Episode_05.swf"
	.swf icon_Episode_06 "icons/Episode_06.swf"
	.swf icon_Episode_07 "icons/Episode_07.swf"
	.swf icon_Episode_08 "icons/Episode_08.swf"
	.swf icon_Episode_09 "icons/Episode_09.swf"
	.swf icon_Episode_10 "icons/Episode_10.swf"

	.box button_shape width=164 height=78 line=0 fill=#333333
	.box button_cover width=162 height=76 line=0 fill=#333333C0

	.text button_Episode_01_title font=GillSans size=100% color=#FFFFFF text="Tahnok Surround\nPo-Koro, Matoran\nlost in fray"
	.text button_Episode_02_title font=GillSans size=100% color=#FFFFFF text="Hafu Saved in\nDaring Rescue"
	.text button_Episode_03_title font=GillSans size=100% color=#FFFFFF text="New Invention\nSaves Onu-Koro"
	.text button_Episode_04_title font=GillSans size=100% color=#FFFFFF text="Le-Koro Liberated!"
	.text button_Episode_05_title font=GillSans size=100% color=#FFFFFF text="Last Moment Save!"
	.text button_Episode_06_title font=GillSans size=100% color=#FFFFFF text="Disaster in Ga-Koro!"
	.text button_Episode_07_title font=GillSans size=100% color=#FFFFFF text="After the Storm"
	.text button_Episode_08_title font=GillSans size=100% color=#FFFFFF text="Theft of Fire"
	.text button_Episode_09_title font=GillSans size=100% color=#FFFFFF text="Out of Their Elements"
	.text button_Episode_10_title font=GillSans size=100% color=#FFFFFF text="Defeat of the\nBohrok-Kal"

	.sprite button_Episode_01_idle
		.put button_shape pin=center
		.put icon_Episode_01 pin=center
	.end

	.sprite button_Episode_02_idle
		.put button_shape pin=center
		.put icon_Episode_02 pin=center
	.end

	.sprite button_Episode_03_idle
		.put button_shape pin=center
		.put icon_Episode_03 pin=center
	.end

	.sprite button_Episode_04_idle
		.put button_shape pin=center
		.put icon_Episode_04 pin=center
	.end

	.sprite button_Episode_05_idle
		.put button_shape pin=center
		.put icon_Episode_05 pin=center
	.end

	.sprite button_Episode_06_idle
		.put button_shape pin=center
		.put icon_Episode_06 pin=center
	.end

	.sprite button_Episode_07_idle
		.put button_shape pin=center
		.put icon_Episode_07 pin=center
	.end

	.sprite button_Episode_08_idle
		.put button_shape pin=center
		.put icon_Episode_08 pin=center
	.end

	.sprite button_Episode_09_idle
		.put button_shape pin=center
		.put icon_Episode_09 pin=center
	.end

	.sprite button_Episode_10_idle
		.put button_shape pin=center
		.put icon_Episode_10 pin=center
	.end

	.sprite button_Episode_01_hover
		.put button_shape pin=center
		.put icon_Episode_01 pin=center
		.put button_cover pin=center
		.put button_Episode_01_title pin=center scale=25%
	.end

	.sprite button_Episode_02_hover
		.put button_shape pin=center
		.put icon_Episode_02 pin=center
		.put button_cover pin=center
		.put button_Episode_02_title pin=center scale=25%
	.end

	.sprite button_Episode_03_hover
		.put button_shape pin=center
		.put icon_Episode_03 pin=center
		.put button_cover pin=center
		.put button_Episode_03_title pin=center scale=25%
	.end

	.sprite button_Episode_04_hover
		.put button_shape pin=center
		.put icon_Episode_04 pin=center
		.put button_cover pin=center
		.put button_Episode_04_title pin=center scale=25%
	.end

	.sprite button_Episode_05_hover
		.put button_shape pin=center
		.put icon_Episode_05 pin=center
		.put button_cover pin=center
		.put button_Episode_05_title pin=center scale=25%
	.end

	.sprite button_Episode_06_hover
		.put button_shape pin=center
		.put icon_Episode_06 pin=center
		.put button_cover pin=center
		.put button_Episode_06_title pin=center scale=25%
	.end

	.sprite button_Episode_07_hover
		.put button_shape pin=center
		.put icon_Episode_07 pin=center
		.put button_cover pin=center
		.put button_Episode_07_title pin=center scale=25%
	.end

	.sprite button_Episode_08_hover
		.put button_shape pin=center
		.put icon_Episode_08 pin=center
		.put button_cover pin=center
		.put button_Episode_08_title pin=center scale=25%
	.end

	.sprite button_Episode_09_hover
		.put button_shape pin=center
		.put icon_Episode_09 pin=center
		.put button_cover pin=center
		.put button_Episode_09_title pin=center scale=25%
	.end

	.sprite button_Episode_10_hover
		.put button_shape pin=center
		.put icon_Episode_10 pin=center
		.put button_cover pin=center
		.put button_Episode_10_title pin=center scale=25%
	.end

	.button button_Episode_01
		.show button_shape pin=center as=area
		.show button_Episode_01_idle as=idle
		.show button_Episode_01_hover as=hover,pressed
		.on_release inside:
			_root.PlayMovie = "Episode_01.swf";
			_root.BackgroundColor = "white";
			_root.TrailingFrames = 0;
		.end
	.end

	.button button_Episode_02
		.show button_shape pin=center as=area
		.show button_Episode_02_idle as=idle
		.show button_Episode_02_hover as=hover,pressed
		.on_release inside:
			_root.PlayMovie = "Episode_02.swf";
			_root.BackgroundColor = "white";
			_root.TrailingFrames = 0;
		.end
	.end

	.button button_Episode_03
		.show button_shape pin=center as=area
		.show button_Episode_03_idle as=idle
		.show button_Episode_03_hover as=hover,pressed
		.on_release inside:
			_root.PlayMovie = "Episode_03.swf";
			_root.BackgroundColor = "black";
			_root.TrailingFrames = 0;
		.end
	.end

	.button button_Episode_04
		.show button_shape pin=center as=area
		.show button_Episode_04_idle as=idle
		.show button_Episode_04_hover as=hover,pressed
		.on_release inside:
			_root.PlayMovie = "Episode_04.swf";
			_root.BackgroundColor = "black";
			_root.TrailingFrames = 0;
		.end
	.end

	.button button_Episode_05
		.show button_shape pin=center as=area
		.show button_Episode_05_idle as=idle
		.show button_Episode_05_hover as=hover,pressed
		.on_release inside:
			_root.PlayMovie = "Episode_05.swf";
			_root.BackgroundColor = "black";
			_root.TrailingFrames = 0;
		.end
	.end

	.button button_Episode_06
		.show button_shape pin=center as=area
		.show button_Episode_06_idle as=idle
		.show button_Episode_06_hover as=hover,pressed
		.on_release inside:
			_root.PlayMovie = "Episode_06.swf";
			_root.BackgroundColor = "black";
			_root.TrailingFrames = 0;
		.end
	.end

	.button button_Episode_07
		.show button_shape pin=center as=area
		.show button_Episode_07_idle as=idle
		.show button_Episode_07_hover as=hover,pressed
		.on_release inside:
			_root.PlayMovie = "Episode_07.swf";
			_root.BackgroundColor = "black";
			_root.TrailingFrames = 0;
		.end
	.end

	.button button_Episode_08
		.show button_shape pin=center as=area
		.show button_Episode_08_idle as=idle
		.show button_Episode_08_hover as=hover,pressed
		.on_release inside:
			_root.PlayMovie = "Episode_08.swf";
			_root.BackgroundColor = "black";
			_root.TrailingFrames = 0;
		.end
	.end

	.button button_Episode_09
		.show button_shape pin=center as=area
		.show button_Episode_09_idle as=idle
		.show button_Episode_09_hover as=hover,pressed
		.on_release inside:
			_root.PlayMovie = "Episode_09.swf";
			_root.BackgroundColor = "black";
			_root.TrailingFrames = 0;
		.end
	.end

	.button button_Episode_10
		.show button_shape pin=center as=area
		.show button_Episode_10_idle as=idle
		.show button_Episode_10_hover as=hover,pressed
		.on_release inside:
			_root.PlayMovie = "Episode_10.swf";
			_root.BackgroundColor = "black";
			_root.TrailingFrames = 3;
		.end
	.end

	.text menu_title font=TradeMarkerLight size=30pt color=#B99359 text="Bohrok Animations"

	.text menu_bohrok_title font=TradeMarkerLight size=26pt color=#999999 text="Bohrok"
	.box menu_bohrok_line width=296 height=2 line=0 fill=#999999

	.text menu_bohrok_kal_title font=TradeMarkerLight size=26pt color=#999999 text="Bohrok-Kal"
	.box menu_bohrok_kal_line width=176 height=2 line=0 fill=#999999

	.sprite bgcolor_white
		.put bgcolor_white_shape
	.end

	.sprite bgcolor_black
		.put bgcolor_black_shape
	.end

	.sprite menu
		.put menu_title pin=center x=385 y=22
		.put menu_bohrok_title pin=center x=385 y=63
		.put menu_bohrok_line_l=menu_bohrok_line pin=left-center  x=25  y=62
		.put menu_bohrok_line_r=menu_bohrok_line pin=right-center x=745 y=62
		.put menu_bohrok_kal_title pin=center x=385 y=301
		.put menu_bohrok_kal_line_l=menu_bohrok_kal_line pin=left-center  x=118 y=300
		.put menu_bohrok_kal_line_r=menu_bohrok_kal_line pin=right-center x=652 y=300
		.put button_Episode_01 x=106 y=125
		.put button_Episode_02 x=292 y=125
		.put button_Episode_03 x=478 y=125
		.put button_Episode_04 x=664 y=125
		.put button_Episode_05 x=199 y=225
		.put button_Episode_06 x=385 y=225
		.put button_Episode_07 x=571 y=225
		.put button_Episode_08 x=199 y=363
		.put button_Episode_09 x=385 y=363
		.put button_Episode_10 x=571 y=363
	.end

	.put bgcolor_white

	.put bgcolor_black

	.put menu

	# Run some code on every frame, SWF5 and SWFTOOLS compatible.
	.sprite action_enterframe
		.action:
			_root.enterframe();
		.end
		.frame
		.action:
			_root.enterframe();
		.end
	.end
	.action:
		bgcolor_white._visible = false;
		bgcolor_black._visible = false;
		_root.PlayMovie = "";
		_root.BackgroundColor = "";
		_root.TrailingFrames = 0;
		_root.PaddingFrames = 0;

		function enterframe() {
			if (_root.PlayMovie != "") {
				_root.menu._visible = false;
				loadMovie(_root.PlayMovie, "_level1");
				_root.PlayMovie = "";
				_root.PaddingFrames = 18 * 3;
			}

			if (_root._level1 && _root._level1._totalframes > 1) {
				if (_root.BackgroundColor != "") {
					if (_root.BackgroundColor == "black") {
						bgcolor_black._visible = true;
						bgcolor_white._visible = false;
					}
					else if (_root.BackgroundColor == "white") {
						bgcolor_white._visible = true;
						bgcolor_black._visible = false;
					}
					_root.BackgroundColor = "";
				}

				if (_root._level1._currentframe + _root.TrailingFrames >= _root._level1._totalframes) {
					if (_root.PaddingFrames-- < 1) {
						_root._level1.unloadMovie();
						bgcolor_white._visible = false;
						bgcolor_black._visible = false;
						_root.menu._visible = true;
						_root.TrailingFrames = 0;
					}
				}
			}
		}
	.end
	.put action_enterframe
.end

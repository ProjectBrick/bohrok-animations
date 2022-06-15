all: \
	player.swf \
	player-30fps.swf \
	bohrokanimations.swf

clean:
	rm -rf player.swf
	rm -rf player-30fps.swf
	rm -rf bohrokanimations.swf

player.swf:
	swfc player.sc

player-30fps.swf: player.swf
	node swffps.mjs 30 player.swf player-30fps.swf

bohrokanimations.swf:
	swfc bohrokanimations.sc

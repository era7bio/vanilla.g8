@ECHO OFF && PUSHD "%~dp0"
s3cmd sync -r --no-delete-removed data/ s3://era7p/$name$/data/
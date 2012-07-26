@ECHO OFF && PUSHD "%~dp0"
s3cmd sync -r --no-delete-removed s3://era7p/$name$/data/ data/
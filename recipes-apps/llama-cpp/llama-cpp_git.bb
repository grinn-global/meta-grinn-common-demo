SUMMARY = "llama.cpp LLM inference framework"
HOMEPAGE = "https://github.com/ggml-org/llama.cpp"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=223b26b3c1143120c87e2b13111d3e99"

DEPENDS = "openssl"

PV = "b10287"

SRC_URI = "git://github.com/ggml-org/llama.cpp.git;protocol=https;branch=master"
SRCREV = "b06aa774c03dbbb624e726664b714a57d1f49815"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = "\
    -DBUILD_SHARED_LIBS=ON \
    -DLLAMA_BUILD_TESTS=OFF \
"

PACKAGES =+ "${PN}-impl"

FILES:${PN}-impl = "${libdir}/lib*-impl.so"

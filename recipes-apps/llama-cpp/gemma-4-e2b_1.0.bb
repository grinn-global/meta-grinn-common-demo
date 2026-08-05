SUMMARY = "Gemma 4 model for llama-cpp"
HOMEPAGE = "https://huggingface.co/unsloth/gemma-4-E2B-it-qat-mobile-GGUF"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "git://huggingface.co/unsloth/gemma-4-E2B-it-qat-mobile-GGUF;protocol=https;branch=main;lfs=1"
SRCREV = "46af839dc23aceb4b965ab640dae7fc1bea39bba"

S = "${WORKDIR}/git"

MODEL_DIR = "${datadir}/grinn-demo/llama-cpp"

do_install() {
    install -d ${D}${MODEL_DIR}
    install -m 0644 ${S}/gemma-4-E2B-it-qat-UD-Q2_K_XL.gguf ${D}${MODEL_DIR}/gemma-4-E2B.gguf
}

FILES:${PN} += "${MODEL_DIR}"

package com.woke.common.encrypt.encryptor;

import com.woke.common.encrypt.EncryptContext;
import com.woke.common.enums.AlgorithmType;
import com.woke.common.enums.EncodeType;
import com.woke.common.utils.EncryptUtils;

/**
 * sm4算法实现
 *
 * @author 老马
 * @version 4.6.0
 */
public class Sm4Encryptor extends AbstractEncryptor {

    private final EncryptContext context;

    public Sm4Encryptor(EncryptContext context) {
        super(context);
        this.context = context;
    }

    /**
     * 获得当前算法
     */
    @Override
    public AlgorithmType algorithm() {
        return AlgorithmType.SM4;
    }

    /**
     * 加密
     *
     * @param value      待加密字符串
     * @param encodeType 加密后的编码格式
     */
    @Override
    public String encrypt(String value, EncodeType encodeType) {
        if (encodeType == EncodeType.HEX) {
            return EncryptUtils.encryptBySm4Hex(value, context.getPassword());
        } else {
            return EncryptUtils.encryptBySm4(value, context.getPassword());
        }
    }

    /**
     * 解密
     *
     * @param value      待加密字符串
     */
    @Override
    public String decrypt(String value) {
        return EncryptUtils.decryptBySm4(value, context.getPassword());
    }
}

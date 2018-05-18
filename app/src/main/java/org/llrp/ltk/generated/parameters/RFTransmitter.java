/*
 *
 * This file was generated by LLRP Code Generator
 * see http://llrp-toolkit.cvs.sourceforge.net/llrp-toolkit/
 * for more information
 * Generated on: Sun Apr 08 14:14:11 EDT 2012;
 *
 */

/*
 * Copyright 2007 ETH Zurich
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 *
 */
package org.llrp.ltk.generated.parameters;

import maximsblog.blogspot.com.llrpexplorer.Logger;

import org.jdom2.Content;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Namespace;

import org.llrp.ltk.exceptions.InvalidLLRPMessageException;
import org.llrp.ltk.exceptions.MissingParameterException;
import org.llrp.ltk.generated.LLRPConstants;
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPMessage;
import org.llrp.ltk.types.SignedShort;
import org.llrp.ltk.types.TLVParameter;
import org.llrp.ltk.types.TVParameter;
import org.llrp.ltk.types.UnsignedShort;

import java.util.LinkedList;
import java.util.List;


/**
 * This Parameter carries the RF transmitter information. The Transmit Power defines the transmit power for the antenna expressed as an index into the TransmitPowerTable (section 9.2.4.1.1). The HopTableID is the index of the frequency hop table to be used by the Reader (section 9.2.4.1.2.1) and is used when operating in frequency-hopping regulatory regions. This field is ignored in non-frequency-hopping regulatory regions. The ChannelIndex is the one-based channel index in the FixedFrequencyTable to use during transmission (section 9.2.4.1.2.2) and is used when operating in non-frequency-hopping regulatory regions. This field is ignored in frequency-hopping regulatory regions.

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=74&view=fit">LLRP Specification Section 12.2.6.2</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=141&view=fit">LLRP Specification Section 16.2.6.8</a>}


 */

/**
 * This Parameter carries the RF transmitter information. The Transmit Power defines the transmit power for the antenna expressed as an index into the TransmitPowerTable (section 9.2.4.1.1). The HopTableID is the index of the frequency hop table to be used by the Reader (section 9.2.4.1.2.1) and is used when operating in frequency-hopping regulatory regions. This field is ignored in non-frequency-hopping regulatory regions. The ChannelIndex is the one-based channel index in the FixedFrequencyTable to use during transmission (section 9.2.4.1.2.2) and is used when operating in non-frequency-hopping regulatory regions. This field is ignored in frequency-hopping regulatory regions.

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=74&view=fit">LLRP Specification Section 12.2.6.2</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=141&view=fit">LLRP Specification Section 16.2.6.8</a>}

      .
 */
public class RFTransmitter extends TLVParameter {
    public static final SignedShort TYPENUM = new SignedShort(224);
    private static final Logger LOGGER = Logger.getLogger(RFTransmitter.class);
    protected UnsignedShort hopTableID;
    protected UnsignedShort channelIndex;
    protected UnsignedShort transmitPower;

    /**
     * empty constructor to create new parameter.
     */
    public RFTransmitter() {
    }

    /**
     * Constructor to create parameter from binary encoded parameter
     * calls decodeBinary to decode parameter.
     * @param list to be decoded
     */
    public RFTransmitter(LLRPBitList list) {
        decodeBinary(list);
    }

    /**
    * Constructor to create parameter from xml encoded parameter
    * calls decodeXML to decode parameter.
    * @param element to be decoded
    */
    public RFTransmitter(Element element) throws InvalidLLRPMessageException {
        decodeXML(element);
    }

    /**
    * {@inheritDoc}
    */
    public LLRPBitList encodeBinarySpecific() {
        LLRPBitList resultBits = new LLRPBitList();

        if (hopTableID == null) {
            LOGGER.warn(" hopTableID not set");
            throw new MissingParameterException(
                " hopTableID not set  for Parameter of Type RFTransmitter");
        }

        resultBits.append(hopTableID.encodeBinary());

        if (channelIndex == null) {
            LOGGER.warn(" channelIndex not set");
            throw new MissingParameterException(
                " channelIndex not set  for Parameter of Type RFTransmitter");
        }

        resultBits.append(channelIndex.encodeBinary());

        if (transmitPower == null) {
            LOGGER.warn(" transmitPower not set");
            throw new MissingParameterException(
                " transmitPower not set  for Parameter of Type RFTransmitter");
        }

        resultBits.append(transmitPower.encodeBinary());

        return resultBits;
    }

    /**
    * {@inheritDoc}
    */
    public Content encodeXML(String name, Namespace ns) {
        // element in namespace defined by parent element
        Element element = new Element(name, ns);
        // child element are always in default LLRP namespace
        ns = Namespace.getNamespace("llrp", LLRPConstants.LLRPNAMESPACE);

        if (hopTableID == null) {
            LOGGER.warn(" hopTableID not set");
            throw new MissingParameterException(" hopTableID not set");
        } else {
            element.addContent(hopTableID.encodeXML("HopTableID", ns));
        }

        if (channelIndex == null) {
            LOGGER.warn(" channelIndex not set");
            throw new MissingParameterException(" channelIndex not set");
        } else {
            element.addContent(channelIndex.encodeXML("ChannelIndex", ns));
        }

        if (transmitPower == null) {
            LOGGER.warn(" transmitPower not set");
            throw new MissingParameterException(" transmitPower not set");
        } else {
            element.addContent(transmitPower.encodeXML("TransmitPower", ns));
        }

        //parameters
        return element;
    }

    /**
    * {@inheritDoc}
    */
    protected void decodeBinarySpecific(LLRPBitList binary) {
        int position = 0;
        int tempByteLength;
        int tempLength = 0;
        int count;
        SignedShort type;
        int fieldCount;
        Custom custom;
        hopTableID = new UnsignedShort(binary.subList(position,
                    UnsignedShort.length()));
        position += UnsignedShort.length();
        channelIndex = new UnsignedShort(binary.subList(position,
                    UnsignedShort.length()));
        position += UnsignedShort.length();
        transmitPower = new UnsignedShort(binary.subList(position,
                    UnsignedShort.length()));
        position += UnsignedShort.length();
    }

    /**
    * {@inheritDoc}
    */
    public void decodeXML(Element element) throws InvalidLLRPMessageException {
        List<Element> tempList = null;
        boolean atLeastOnce = false;
        Custom custom;

        Element temp = null;

        // child element are always in default LLRP namespace
        Namespace ns = Namespace.getNamespace(LLRPConstants.LLRPNAMESPACE);

        temp = element.getChild("HopTableID", ns);

        if (temp != null) {
            hopTableID = new UnsignedShort(temp);
        }

        element.removeChild("HopTableID", ns);
        temp = element.getChild("ChannelIndex", ns);

        if (temp != null) {
            channelIndex = new UnsignedShort(temp);
        }

        element.removeChild("ChannelIndex", ns);
        temp = element.getChild("TransmitPower", ns);

        if (temp != null) {
            transmitPower = new UnsignedShort(temp);
        }

        element.removeChild("TransmitPower", ns);

        if (element.getChildren().size() > 0) {
            String message = "RFTransmitter has unknown element " +
                ((Element) element.getChildren().get(0)).getName();
            throw new InvalidLLRPMessageException(message);
        }
    }

    //setters
    /**
    * set   hopTableID of type UnsignedShort .
    * @param   hopTableID to be set
    */
    public void setHopTableID(final UnsignedShort hopTableID) {
        this.hopTableID = hopTableID;
    }

    /**
    * set   channelIndex of type UnsignedShort .
    * @param   channelIndex to be set
    */
    public void setChannelIndex(final UnsignedShort channelIndex) {
        this.channelIndex = channelIndex;
    }

    /**
    * set   transmitPower of type UnsignedShort .
    * @param   transmitPower to be set
    */
    public void setTransmitPower(final UnsignedShort transmitPower) {
        this.transmitPower = transmitPower;
    }

    // end setter

    //getters
    /**
    * get   hopTableID of type UnsignedShort.
    * @return   type UnsignedShort to be set
    */
    public UnsignedShort getHopTableID() {
        return this.hopTableID;
    }

    /**
    * get   channelIndex of type UnsignedShort.
    * @return   type UnsignedShort to be set
    */
    public UnsignedShort getChannelIndex() {
        return this.channelIndex;
    }

    /**
    * get   transmitPower of type UnsignedShort.
    * @return   type UnsignedShort to be set
    */
    public UnsignedShort getTransmitPower() {
        return this.transmitPower;
    }

    // end getters

    //add methods

    // end add

    /**
    * For TLV Parameter length can not be determined at compile time. This method therefore always returns 0.
    * @return Integer always zero
    */
    public static Integer length() {
        return 0;
    }

    /**
    * {@inheritDoc}
    */
    public SignedShort getTypeNum() {
        return TYPENUM;
    }

    /**
    * {@inheritDoc}
    */
    public String getName() {
        return "RFTransmitter";
    }

    /**
    * return string representation. All field values but no parameters are included
    * @return String
    */
    public String toString() {
        String result = "RFTransmitter: ";
        result += ", hopTableID: ";
        result += hopTableID;
        result += ", channelIndex: ";
        result += channelIndex;
        result += ", transmitPower: ";
        result += transmitPower;
        result = result.replaceFirst(", ", "");

        return result;
    }
}

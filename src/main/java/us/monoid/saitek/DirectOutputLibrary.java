package us.monoid.saitek;;

import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Pointer;
import com.sun.jna.PointerType;
import com.sun.jna.WString;
import com.sun.jna.win32.StdCallLibrary;
/**
 * JNA Wrapper for library <b>DirectOutput</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public interface DirectOutputLibrary extends StdCallLibrary {
	public static final String JNA_LIBRARY_NAME = "DirectOutput";
	//public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(DirectOutputLibrary.JNA_LIBRARY_NAME);// MangledFunctionMapper.DEFAULT_OPTIONS);
	
	/** X52Pro ScrollClick */
	public static final int SoftButton_Select = 0x00000001;
	/** X52Pro ScrollUp, FIP RightScrollClockwize */
	public static final int SoftButton_Up = 0x00000002;
	/** X52Pro ScrollDown, FIP RightScrollAnticlockwize */
	public static final int SoftButton_Down = 0x00000004;
	/** FIP LeftScrollAnticlockwize */
	public static final int SoftButton_Left = 0x00000008;
	/** FIP LeftScrollClockwize */
	public static final int SoftButton_Right = 0x00000010;
	/** FIP LeftButton1 */
	public static final int SoftButton_1 = 0x00000020;
	/** FIP LeftButton2 */
	public static final int SoftButton_2 = 0x00000040;
	/** FIP LeftButton3 */
	public static final int SoftButton_3 = 0x00000080;
	/** FIP LeftButton4 */
	public static final int SoftButton_4 = 0x00000100;
	/** FIP LeftButton5 */
	public static final int SoftButton_5 = 0x00000200;
	/** FIP LeftButton6 */
	public static final int SoftButton_6 = 0x00000400;
	/** Set this page as the Active Page */
	public static final int FLAG_SET_AS_ACTIVE = 0x00000001;
	public interface Pfn_DirectOutput_EnumerateCallback extends StdCallLibrary.StdCallCallback {
		void apply(Pointer hDevice, Pointer pCtxt);
	};
	public interface Pfn_DirectOutput_DeviceChange extends StdCallLibrary.StdCallCallback {
		void apply(Pointer hDevice, byte bAdded, Pointer pCtxt);
	};
	public interface Pfn_DirectOutput_PageChange extends StdCallLibrary.StdCallCallback {
		void apply(Pointer hDevice, int dwPage, byte bSetActive, Pointer pCtxt);
	};
  public interface Pfn_DirectOutput_SoftButtonChange extends StdCallLibrary.StdCallCallback {
		void apply(Pointer hDevice, int dwButtons, Pointer pCtxt);
	};
	public interface Pfn_DirectOutput_Deinitialize extends StdCallLibrary.StdCallCallback {
		DirectOutputLibrary.HRESULT apply();
	};
	public interface Pfn_DirectOutput_RegisterDeviceCallback extends StdCallLibrary.StdCallCallback {
		DirectOutputLibrary.HRESULT apply(DirectOutputLibrary.Pfn_DirectOutput_DeviceChange pfnCb, Pointer pCtxt);
	};
	public interface Pfn_DirectOutput_Enumerate extends StdCallLibrary.StdCallCallback {
		DirectOutputLibrary.HRESULT apply(DirectOutputLibrary.Pfn_DirectOutput_EnumerateCallback pfnCb, Pointer pCtxt);
	};
	public interface Pfn_DirectOutput_RegisterPageCallback extends StdCallLibrary.StdCallCallback {
		DirectOutputLibrary.HRESULT apply(Pointer hDevice, DirectOutputLibrary.Pfn_DirectOutput_PageChange pfnCb, Pointer pCtxt);
	};
	public interface Pfn_DirectOutput_RegisterSoftButtonCallback extends StdCallLibrary.StdCallCallback {
		DirectOutputLibrary.HRESULT apply(Pointer hDevice, DirectOutputLibrary.Pfn_DirectOutput_SoftButtonChange pfnCb, Pointer pCtxt);
	};
	public interface Pfn_DirectOutput_GetDeviceType extends StdCallLibrary.StdCallCallback {
		DirectOutputLibrary.HRESULT apply(Pointer hDevice, DirectOutputLibrary.LPGUID pGuid);
	};
	public interface Pfn_DirectOutput_GetDeviceInstance extends StdCallLibrary.StdCallCallback {
		DirectOutputLibrary.HRESULT apply(Pointer hDevice, DirectOutputLibrary.LPGUID pGuid);
	};
	
	public interface Pfn_DirectOutput_AddPage extends StdCallLibrary.StdCallCallback {
		DirectOutputLibrary.HRESULT apply(Pointer hDevice, int dwPage, int dwFlags);
	};
	public interface Pfn_DirectOutput_RemovePage extends StdCallLibrary.StdCallCallback {
		DirectOutputLibrary.HRESULT apply(Pointer hDevice, int dwPage);
	};
	public interface Pfn_DirectOutput_SetLed extends StdCallLibrary.StdCallCallback {
		DirectOutputLibrary.HRESULT apply(Pointer hDevice, int dwPage, int dwIndex, int dwValue);
	};
	
	public interface Pfn_DirectOutput_SetImage extends StdCallLibrary.StdCallCallback {
		DirectOutputLibrary.HRESULT apply(Pointer hDevice, int dwPage, int dwIndex, int cbValue, Pointer pvValue);
	};
	

	public interface Pfn_DirectOutput_CloseServer extends StdCallLibrary.StdCallCallback {
		DirectOutputLibrary.HRESULT apply(Pointer hDevice, int dwServerId, SRequestStatus psStatus);
	};
	public interface Pfn_DirectOutput_SendServerMsg extends StdCallLibrary.StdCallCallback {
		DirectOutputLibrary.HRESULT apply(Pointer hDevice, int dwServerId, int dwRequest, int dwPage, int cbIn, Pointer pvIn, int cbOut, Pointer pvOut, SRequestStatus psStatus);
	};
	
	
	public interface Pfn_DirectOutput_DisplayFile extends StdCallLibrary.StdCallCallback {
		DirectOutputLibrary.HRESULT apply(Pointer hDevice, int dwPage, int dwFile, int dwIndex, SRequestStatus psStatus);
	};
	public interface Pfn_DirectOutput_DeleteFile extends StdCallLibrary.StdCallCallback {
		DirectOutputLibrary.HRESULT apply(Pointer hDevice, int dwPage, int dwFile, SRequestStatus psStatus);
	};
	
	/**
	 * S_OK : succeeded<br>
	 * Original signature : <code>HRESULT DirectOutput_Initialize(const wchar_t*)</code><br>
	 * <i>native declaration : line 90</i>
	 */
	DirectOutputLibrary.HRESULT DirectOutput_Initialize(WString wszPluginName);
	/**
	 * S_OK : succeeded<br>
	 * Original signature : <code>HRESULT DirectOutput_Deinitialize()</code><br>
	 * <i>native declaration : line 97</i>
	 */
	DirectOutputLibrary.HRESULT DirectOutput_Deinitialize();
	/**
	 * S_OK : succeeded<br>
	 * Original signature : <code>HRESULT DirectOutput_RegisterDeviceCallback(Pfn_DirectOutput_DeviceChange, void*)</code><br>
	 * <i>native declaration : line 106</i>
	 */
	DirectOutputLibrary.HRESULT DirectOutput_RegisterDeviceCallback(DirectOutputLibrary.Pfn_DirectOutput_DeviceChange pfnCb, Pointer pCtxt);
	/**
	 * HRESULT __stdcall DirectOutput_Enumerate();<br>
	 * Original signature : <code>HRESULT DirectOutput_Enumerate(Pfn_DirectOutput_EnumerateCallback, void*)</code><br>
	 * <i>native declaration : line 114</i>
	 */
	DirectOutputLibrary.HRESULT DirectOutput_Enumerate(DirectOutputLibrary.Pfn_DirectOutput_EnumerateCallback pfnCb, Pointer pCtxt);
	/**
	 * E_HANDLE : hDevice is not a valid device handle<br>
	 * Original signature : <code>HRESULT DirectOutput_RegisterPageCallback(void*, Pfn_DirectOutput_PageChange, void*)</code><br>
	 * <i>native declaration : line 128</i>
	 */
	DirectOutputLibrary.HRESULT DirectOutput_RegisterPageCallback(Pointer hDevice, DirectOutputLibrary.Pfn_DirectOutput_PageChange pfnCb, Pointer pCtxt);
	/**
	 * E_HANDLE : hDevice is not a valid device handle<br>
	 * Original signature : <code>HRESULT DirectOutput_RegisterSoftButtonCallback(void*, Pfn_DirectOutput_SoftButtonChange, void*)</code><br>
	 * <i>native declaration : line 139</i>
	 */
	DirectOutputLibrary.HRESULT DirectOutput_RegisterSoftButtonCallback(Pointer hDevice, DirectOutputLibrary.Pfn_DirectOutput_SoftButtonChange pfnCb, Pointer pCtxt);
	/**
	 * E_INVALIDARG : pGuid is NULL<br>
	 * Original signature : <code>HRESULT DirectOutput_GetDeviceType(void*, LPGUID)</code><br>
	 * <i>native declaration : line 153</i>
	 */
	DirectOutputLibrary.HRESULT DirectOutput_GetDeviceType(Pointer hDevice, DirectOutputLibrary.LPGUID pGuid);
	/**
	 * E_NOTIMPL : hDevice does not support DirectInput.<br>
	 * Original signature : <code>HRESULT DirectOutput_GetDeviceInstance(void*, LPGUID)</code><br>
	 * <i>native declaration : line 165</i>
	 */
	DirectOutputLibrary.HRESULT DirectOutput_GetDeviceInstance(Pointer hDevice, DirectOutputLibrary.LPGUID pGuid);
	
	/**
	 * E_NOTIMPL : hDevice does not support SST profiles<br>
	 * Original signature : <code>HRESULT DirectOutput_SetProfile(void*, DWORD, const wchar_t*)</code><br>
	 * <i>native declaration : line 180</i>
	 */
	DirectOutputLibrary.HRESULT DirectOutput_SetProfile(Pointer hDevice, int cchProfile, WString wszProfile);
	
    
	/**
	 * E_HANDLE : hDevice is not a valid device handle<br>
	 * Original signature : <code>HRESULT DirectOutput_AddPage(void*, DWORD, const wchar_t*, DWORD)</code><br>
	 * <i>native declaration : line 195</i>
	 */
	DirectOutputLibrary.HRESULT DirectOutput_AddPage(Pointer hDevice, int dwPage, WString wszDebugName, int dwFlags);
	/**
	 * E_INVALIDARG : dwPage is not a valid page id<br>
	 * Original signature : <code>HRESULT DirectOutput_RemovePage(void*, DWORD)</code><br>
	 * <i>native declaration : line 206</i>
	 */
	DirectOutputLibrary.HRESULT DirectOutput_RemovePage(Pointer hDevice, int dwPage);
	/**
	 * E_PAGENOTACTIVE : dwPage is not the active page<br>
	 * Original signature : <code>HRESULT DirectOutput_SetLed(void*, DWORD, DWORD, DWORD)</code><br>
	 * <i>native declaration : line 224</i>
	 */
	DirectOutputLibrary.HRESULT DirectOutput_SetLed(Pointer hDevice, int dwPage, int dwIndex, int dwValue);
	
	/**
	 * E_PAGENOTACTIVE : dwPage is not the active page<br>
	 * Original signature : <code>HRESULT DirectOutput_SetString(void*, DWORD, DWORD, DWORD, const wchar_t*)</code><br>
	 * <i>native declaration : line 240</i>
	 */
	DirectOutputLibrary.HRESULT DirectOutput_SetString(Pointer hDevice, int dwPage, int dwIndex, int cchValue, WString wszValue);
	/**
	 * E_BUFFERTOOSMALL : cbValue is not of the correct size<br>
	 * Original signature : <code>HRESULT DirectOutput_SetImage(void*, DWORD, DWORD, DWORD, const void*)</code><br>
	 * <i>native declaration : line 257</i>
	 */
	DirectOutputLibrary.HRESULT DirectOutput_SetImage(Pointer hDevice, int dwPage, int dwIndex, int cbValue, Pointer pvValue);
	
	/**
	 * E_PAGENOTACTIVE : dwPage is not the active page<br>
	 * Original signature : <code>HRESULT DirectOutput_SetImageFromFile(void*, DWORD, DWORD, DWORD, const wchar_t*)</code><br>
	 * <i>native declaration : line 273</i>
	 */
	DirectOutputLibrary.HRESULT DirectOutput_SetImageFromFile(Pointer hDevice, int dwPage, int dwIndex, int cchFilename, WString wszFilename);
	
	/**
	 * E_FAIL : fatal error<br>
	 * Original signature : <code>HRESULT DirectOutput_StartServer(void*, DWORD, const wchar_t*, LPDWORD, PSRequestStatus)</code><br>
	 * <i>native declaration : line 291</i>
	 */
	DirectOutputLibrary.HRESULT DirectOutput_StartServer(Pointer hDevice, int cchFilename, WString wszFilename, DirectOutputLibrary.LPDWORD pdwServerId, SRequestStatus psStatus);
	/**
	 * E_FAIL : fatal error<br>
	 * Original signature : <code>HRESULT DirectOutput_CloseServer(void*, DWORD, PSRequestStatus)</code><br>
	 * <i>native declaration : line 304</i>
	 */
	DirectOutputLibrary.HRESULT DirectOutput_CloseServer(Pointer hDevice, int dwServerId, SRequestStatus psStatus);
	/**
	 * E_PAGENOTACTIVE : dwPage is not the active page and the server tried to access the display<br>
	 * Original signature : <code>HRESULT DirectOutput_SendServerMsg(void*, DWORD, DWORD, DWORD, DWORD, const void*, DWORD, void*, PSRequestStatus)</code><br>
	 * <i>native declaration : line 324</i>
	 */
	DirectOutputLibrary.HRESULT DirectOutput_SendServerMsg(Pointer hDevice, int dwServerId, int dwRequest, int dwPage, int cbIn, Pointer pvIn, int cbOut, Pointer pvOut, SRequestStatus psStatus);
	
	/**
	 * E_PAGENOTACTIVE : dwPage is not the active page and the server tried to access the display<br>
	 * Original signature : <code>HRESULT DirectOutput_SendServerFile(void*, DWORD, DWORD, DWORD, DWORD, const void*, DWORD, const wchar_t*, DWORD, void*, PSRequestStatus)</code><br>
	 * <i>native declaration : line 346</i>
	 */
	DirectOutputLibrary.HRESULT DirectOutput_SendServerFile(Pointer hDevice, int dwServerId, int dwRequest, int dwPage, int cbInHdr, Pointer pvInHdr, int cchFile, WString wszFile, int cbOut, Pointer pvOut, SRequestStatus psStatus);
	
	/**
	 * E_FAIL : fatal error<br>
	 * Original signature : <code>HRESULT DirectOutput_SaveFile(void*, DWORD, DWORD, DWORD, const wchar_t*, PSRequestStatus)</code><br>
	 * <i>native declaration : line 365</i>
	 */
	DirectOutputLibrary.HRESULT DirectOutput_SaveFile(Pointer hDevice, int dwPage, int dwFile, int cchFilename, WString wszFilename, SRequestStatus psStatus);
	/**
	 * E_FAIL : fatal error<br>
	 * Original signature : <code>HRESULT DirectOutput_DisplayFile(void*, DWORD, DWORD, DWORD, PSRequestStatus)</code><br>
	 * <i>native declaration : line 381</i>
	 */
	DirectOutputLibrary.HRESULT DirectOutput_DisplayFile(Pointer hDevice, int dwPage, int dwIndex, int dwFile, SRequestStatus psStatus);
	/**
	 * E_FAIL : fatal error<br>
	 * Original signature : <code>HRESULT DirectOutput_DeleteFile(void*, DWORD, DWORD, PSRequestStatus)</code><br>
	 * <i>native declaration : line 395</i>
	 */
	DirectOutputLibrary.HRESULT DirectOutput_DeleteFile(Pointer hDevice, int dwPage, int dwFile, SRequestStatus psStatus);
	public static class HRESULT extends PointerType {
		public HRESULT(Pointer address) {
			super(address);
		}
		public HRESULT() {
			super();
		}
	};
	public static class LPGUID extends PointerType {
		public LPGUID(Pointer address) {
			super(address);
		}
		public LPGUID() {
			super();
		}
	};
	public static class LPDWORD extends PointerType {
		public LPDWORD(Pointer address) {
			super(address);
		}
		public LPDWORD() {
			super();
		}
	};
}
